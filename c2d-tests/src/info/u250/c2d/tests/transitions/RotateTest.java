package info.u250.c2d.tests.transitions;

import info.u250.c2d.engine.CoreProvider.TransitionType;


public class RotateTest extends AbstractTransiton{

	@Override
	TransitionType a2b() {
		return TransitionType.Rotate;
	}

	@Override
	TransitionType b2a() {
		return TransitionType.Rotate;
	}
	
}
