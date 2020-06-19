package annotation.laptop2nd;

import annotation.laptopInterface.Cd;
import annotation.laptopInterface.Floppy;

public class ThinkPad2 implements Floppy, Cd {

	@Override
	public void cd_drive() {
		// TODO Auto-generated method stub

	}

	@Override
	@Deprecated
	public void floppy_disk() {
		// TODO Auto-generated method stub

	}

}
