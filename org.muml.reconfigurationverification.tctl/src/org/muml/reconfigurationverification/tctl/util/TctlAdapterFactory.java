/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.reconfigurationverification.tctl.*;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.AtomicProposition;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.TCTLFormula;
import org.muml.reconfigurationverification.tctl.TctlPackage;
import org.muml.reconfigurationverification.tctl.TemporalFormula;
import org.muml.reconfigurationverification.tctl.Term;
import org.muml.reconfigurationverification.tctl.UnaryFormula;
import org.muml.reconfigurationverification.tctl.UnaryTemporalFormula;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfigurationverification.tctl.TctlPackage
 * @generated
 */
public class TctlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TctlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TctlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TctlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TctlSwitch<Adapter> modelSwitch =
		new TctlSwitch<Adapter>() {
			@Override
			public Adapter caseFormulaDefinition(FormulaDefinition object) {
				return createFormulaDefinitionAdapter();
			}
			@Override
			public Adapter caseAtomicFormula(AtomicFormula object) {
				return createAtomicFormulaAdapter();
			}
			@Override
			public Adapter caseUnaryFormula(UnaryFormula object) {
				return createUnaryFormulaAdapter();
			}
			@Override
			public Adapter caseBinaryFormula(BinaryFormula object) {
				return createBinaryFormulaAdapter();
			}
			@Override
			public Adapter caseNotFormula(NotFormula object) {
				return createNotFormulaAdapter();
			}
			@Override
			public Adapter caseUnaryTemporalFormula(UnaryTemporalFormula object) {
				return createUnaryTemporalFormulaAdapter();
			}
			@Override
			public Adapter caseBinaryLogicFormula(BinaryLogicFormula object) {
				return createBinaryLogicFormulaAdapter();
			}
			@Override
			public Adapter caseBinaryTemporalFormula(BinaryTemporalFormula object) {
				return createBinaryTemporalFormulaAdapter();
			}
			@Override
			public Adapter caseTemporalFormula(TemporalFormula object) {
				return createTemporalFormulaAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseAtomicProposition(AtomicProposition object) {
				return createAtomicPropositionAdapter();
			}
			@Override
			public Adapter caseTCTLFormula(TCTLFormula object) {
				return createTCTLFormulaAdapter();
			}
			@Override
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.FormulaDefinition <em>Formula Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.FormulaDefinition
	 * @generated
	 */
	public Adapter createFormulaDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.TCTLFormula <em>TCTL Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.TCTLFormula
	 * @generated
	 */
	public Adapter createTCTLFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.AtomicFormula <em>Atomic Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.AtomicFormula
	 * @generated
	 */
	public Adapter createAtomicFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.UnaryFormula <em>Unary Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.UnaryFormula
	 * @generated
	 */
	public Adapter createUnaryFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.BinaryFormula <em>Binary Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.BinaryFormula
	 * @generated
	 */
	public Adapter createBinaryFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.NotFormula <em>Not Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.NotFormula
	 * @generated
	 */
	public Adapter createNotFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.UnaryTemporalFormula <em>Unary Temporal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.UnaryTemporalFormula
	 * @generated
	 */
	public Adapter createUnaryTemporalFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.BinaryLogicFormula <em>Binary Logic Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.BinaryLogicFormula
	 * @generated
	 */
	public Adapter createBinaryLogicFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.BinaryTemporalFormula <em>Binary Temporal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.BinaryTemporalFormula
	 * @generated
	 */
	public Adapter createBinaryTemporalFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.TemporalFormula <em>Temporal Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.TemporalFormula
	 * @generated
	 */
	public Adapter createTemporalFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.reconfigurationverification.tctl.AtomicProposition <em>Atomic Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.reconfigurationverification.tctl.AtomicProposition
	 * @generated
	 */
	public Adapter createAtomicPropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TctlAdapterFactory
