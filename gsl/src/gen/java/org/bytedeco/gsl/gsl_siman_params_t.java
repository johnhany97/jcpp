// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* this structure contains all the information needed to structure the
   search, beyond the energy function, the step function and the
   initial guess. */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_siman_params_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_siman_params_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_siman_params_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_siman_params_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_siman_params_t position(long position) {
        return (gsl_siman_params_t)super.position(position);
    }

  public native int n_tries(); public native gsl_siman_params_t n_tries(int setter);          /* how many points to try for each step */
  public native int iters_fixed_T(); public native gsl_siman_params_t iters_fixed_T(int setter);    /* how many iterations at each temperature? */
  public native double step_size(); public native gsl_siman_params_t step_size(double setter);     /* max step size in the random walk */
  /* the following parameters are for the Boltzmann distribution */
  public native double k(); public native gsl_siman_params_t k(double setter);
  public native double t_initial(); public native gsl_siman_params_t t_initial(double setter);
  public native double mu_t(); public native gsl_siman_params_t mu_t(double setter);
  public native double t_min(); public native gsl_siman_params_t t_min(double setter);
}
