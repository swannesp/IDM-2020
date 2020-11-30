package uml2idl.testing.util

import java.io.FileInputStream
import java.util.HashMap
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.m2m.atl.core.IExtractor
import org.eclipse.m2m.atl.core.IInjector
import org.eclipse.m2m.atl.core.IModel
import org.eclipse.m2m.atl.core.IReferenceModel
import org.eclipse.m2m.atl.core.ModelFactory
import org.eclipse.m2m.atl.core.emf.EMFExtractor
import org.eclipse.m2m.atl.core.emf.EMFInjector
import org.eclipse.m2m.atl.core.emf.EMFModel
import org.eclipse.m2m.atl.core.emf.EMFModelFactory
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel
import org.eclipse.m2m.atl.core.launch.ILauncher
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher

class ATLHelper {
	static def void transform(String inputMetamodelPath, String inputMetamodelATLName, String outputMetamodelPath, String outputMetamodelATLName, String inputModelPath,
		String transformationAsmPath, String outputModelPath) {
		/*
		 * Initializations
		 */
		var ILauncher transformationLauncher = new EMFVMLauncher()
		var ModelFactory modelFactory = new EMFModelFactory()
		var IInjector injector = new EMFInjector()
		var IExtractor extractor = new EMFExtractor()
		/*
		 * Load metamodels
		 */
		var IReferenceModel inputMetamodel = modelFactory.newReferenceModel()
		injector.inject(inputMetamodel, inputMetamodelPath)
		var IReferenceModel outputMetamodel = modelFactory.newReferenceModel()
		injector.inject(outputMetamodel, outputMetamodelPath)

		/*
		 * Run  transformation
		 */
		var IModel outputModel = modelFactory.newModel(outputMetamodel)
		transformationLauncher.initialize(new HashMap<String, Object>())
		var IModel inputModel = modelFactory.newModel(inputMetamodel)
		injector.inject(inputModel, inputModelPath)
		transformationLauncher.addInModel(inputModel, "IN", inputMetamodelATLName)
		transformationLauncher.addOutModel(outputModel, "OUT", outputMetamodelATLName)
		transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String, Object>(),
			new FileInputStream(transformationAsmPath))
		extractor.extract(outputModel, outputModelPath)
		/*
		 * Unload all models and metamodels (EMF-specific)
		 */
		var EMFModelFactory emfModelFactory = (modelFactory as EMFModelFactory)
		emfModelFactory.unload((inputModel as EMFModel))
		emfModelFactory.unload((outputModel as EMFModel))
		emfModelFactory.unload((inputMetamodel as EMFReferenceModel))
		emfModelFactory.unload((outputMetamodel as EMFReferenceModel))

	}
}
