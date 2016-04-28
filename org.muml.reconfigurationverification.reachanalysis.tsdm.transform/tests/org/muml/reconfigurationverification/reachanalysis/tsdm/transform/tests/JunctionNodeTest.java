package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.muml.core.expressions.TextualExpression;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.JunctionNode;
import org.muml.storydiagram.patterns.AbstractVariable;

public class JunctionNodeTest extends TransformationTest {

	@Test
	public void test() {
		// no unchangeable nodes
		this.setClassesOfUnchangeableNodes(new HashSet<EClass>());
		// transform the tgts
		tgts = this.createForEachRules(tgts);

		// chech the result
		// still only one rule
		assertTrue(tgts.getRules().size() == 1);

		TimedStoryDiagram tsd = tgts.getRules().get(0);

		// search the initial node
		InitialNode initialNode = null;
		for(ActivityNode node : tsd.getOwnedActivityNodes())
		{
			if(node instanceof InitialNode)
			{
				initialNode = (InitialNode) node;
			}
		}
		assertTrue(initialNode != null);

		// check if the ActivityNode node1 was transformed correctly
		ActivityNode restoreMatchingNode = checkOneNodeTransformed(initialNode);

		assertTrue(restoreMatchingNode.getOutgoings().size() == 1);
		
		ActivityEdge edge = restoreMatchingNode.getOutgoings().get(0);
		
		assertTrue(edge.getTarget() instanceof JunctionNode);
		
		JunctionNode junctionNode = (JunctionNode) edge.getTarget();
		
		for(ActivityEdge junctionNodeEdge : junctionNode.getOutgoings())
		{
			assertTrue(junctionNodeEdge.getGuard() == EdgeGuard.BOOL);
			
			ActivityNode node = junctionNodeEdge.getTarget();
			assertTrue(node.getOutgoings().size() == 1);
			edge = node.getOutgoings().get(0);
			assertTrue(edge.getTarget() == initialNode.getOutgoings().get(0).getTarget());

			if(((TextualExpression) junctionNodeEdge.getGuardExpression()).getExpressionText().equals("cond1"))
			{
				assertTrue(node.getName().equals("node2"));
			}
			else if(((TextualExpression) junctionNodeEdge.getGuardExpression()).getExpressionText().equals("cond2"))
			{
				assertTrue(node.getName().equals("node3"));
			}
			else
				fail("Wrong or missing guard expression:" + junctionNodeEdge.getGuardExpression());
			
		}

	}

	@Override
	protected String getRuleName() {
		return "JunctionNode.timedstorydiagram";
	}

	@Override
	protected void checkPortObject(AbstractVariable port) {
		// no object variables
	}

	@Override
	protected void checkRestoreMatchingNodeContents(
			TimedActivityNode restoreMatchingNode) {
		// node is empty
		
	}

}
