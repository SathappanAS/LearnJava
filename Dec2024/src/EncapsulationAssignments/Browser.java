package EncapsulationAssignments;
public class Browser {
	
public void launchBrowser() {
	System.out.println("launching  browser");
	checkVersion();
	checkRAM();
	checkLatestUpdates();
	checkOSCompatible();
	System.out.println("browser is launched");
}

private void checkVersion() {
	System.out.println("check browser version");
}

private void checkRAM() {
	System.out.println("check RAM size");
}

private void checkLatestUpdates() {
	System.out.println("checking latest updates");
}

private void checkOSCompatible() {
	System.out.println("checkOSCompatible");
}
}