/*
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LiTeLLabStandaloneSetup extends LiTeLLabStandaloneSetupGenerated {

	public static void doSetup() {
		new LiTeLLabStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}