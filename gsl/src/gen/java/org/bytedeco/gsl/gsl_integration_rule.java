// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* Definition of an integration rule */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_integration_rule extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    gsl_integration_rule(Pointer p) { super(p); }
    protected gsl_integration_rule() { allocate(); }
    private native void allocate();
    public native void call(@Const gsl_function f,
                                   double a, double b,
                                   DoublePointer result, DoublePointer abserr,
                                   DoublePointer defabs, DoublePointer resabs);
}
