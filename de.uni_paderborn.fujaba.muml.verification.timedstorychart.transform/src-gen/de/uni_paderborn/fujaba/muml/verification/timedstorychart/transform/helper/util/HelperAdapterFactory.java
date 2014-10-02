/**
 */
package de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.PreTransformationHelper;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationOutput;
import de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.HelperPackage
 * @generated
 */
public class HelperAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HelperPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HelperPackage.eINSTANCE;
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
	protected HelperSwitch<Adapter> modelSwitch =
		new HelperSwitch<Adapter>() {
			@Override
			public Adapter caseTSCTransformationInput(TSCTransformationInput object) {
				return createTSCTransformationInputAdapter();
			}
			@Override
			public Adapter caseTSCTransformationOutput(TSCTransformationOutput object) {
				return createTSCTransformationOutputAdapter();
			}
			@Override
			public Adapter caseTransitionTuple(TransitionTuple object) {
				return createTransitionTupleAdapter();
			}
			@Override
			public Adapter casePreTransformationHelper(PreTransformationHelper object) {
				return createPreTransformationHelperAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput <em>TSC Transformation Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationInput
	 * @generated
	 */
	public Adapter createTSCTransformationInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationOutput <em>TSC Transformation Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TSCTransformationOutput
	 * @generated
	 */
	public Adapter createTSCTransformationOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple <em>Transition Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.TransitionTuple
	 * @generated
	 */
	public Adapter createTransitionTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.PreTransformationHelper <em>Pre Transformation Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.verification.timedstorychart.transform.helper.PreTransformationHelper
	 * @generated
	 */
	public Adapter createPreTransformationHelperAdapter() {
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

} //HelperAdapterFactory