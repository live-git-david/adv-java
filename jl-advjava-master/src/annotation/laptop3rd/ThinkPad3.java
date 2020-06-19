package annotation.laptop3rd;

import annotation.laptopInterface.Cd;
import annotation.laptopInterface.Floppy;
import annotation.laptopInterface.Usb;

public class ThinkPad3 implements Floppy, Cd, Usb {
	@Deprecated
	public void floppy_disk() {

	}

	@Deprecated
	public void cd_drive() {

	}

	public void usb_port() {

	}
}
