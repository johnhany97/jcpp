// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_rstat_quantile_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_rstat_quantile_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_rstat_quantile_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_rstat_quantile_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_rstat_quantile_workspace position(long position) {
        return (gsl_rstat_quantile_workspace)super.position(position);
    }

  public native double p(); public native gsl_rstat_quantile_workspace p(double setter);        /* p-quantile */
  public native double q(int i); public native gsl_rstat_quantile_workspace q(int i, double setter);
  @MemberGetter public native DoublePointer q();     /* heights q_i */
  public native int npos(int i); public native gsl_rstat_quantile_workspace npos(int i, int setter);
  @MemberGetter public native IntPointer npos();     /* positions n_i */
  public native double np(int i); public native gsl_rstat_quantile_workspace np(int i, double setter);
  @MemberGetter public native DoublePointer np();    /* desired positions n_i' */
  public native double dnp(int i); public native gsl_rstat_quantile_workspace dnp(int i, double setter);
  @MemberGetter public native DoublePointer dnp();   /* increments dn_i' */
  public native @Cast("size_t") long n(); public native gsl_rstat_quantile_workspace n(long setter);        /* number of data added */
}
