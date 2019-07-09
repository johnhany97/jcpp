// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


@Name("ngraph::runtime::Executable") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Executable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Executable(Pointer p) { super(p); }


    /** @param outputs vector of runtime::Tensor used as outputs
     *  @param inputs vector of runtime::Tensor used as inputs
     *  @return true if iteration is successful, false otherwise */
    public native @Cast("bool") boolean call(@Const @ByRef TensorVector outputs,
                          @Const @ByRef TensorVector inputs);

    /** \brief Executes a single iteration of a Function.
     *  @param outputs vector of runtime::Tensor used as outputs
     *  @param inputs vector of runtime::Tensor used as inputs
     *  @return true if iteration is successful, false otherwise */
    public native @Cast("bool") boolean call_with_validate(@Const @ByRef TensorVector outputs,
                                @Const @ByRef TensorVector inputs);

    /** \brief Collect performance information gathered on a Function.
     *  @return Vector of PerformanceCounter information. */
    public native @StdVector PerformanceCounter get_performance_data();

    /** \brief Validates a Function.
     *  @param outputs vector of runtime::Tensor used as outputs
     *  @param inputs vector of runtime::Tensor used as inputs */
    public native void validate(@Const @ByRef TensorVector outputs,
                      @Const @ByRef TensorVector inputs);

    /** \brief Query the input Parameters
     *  @return an ngraph::op::ParameterVector of all input parameters */
    public native @Const @ByRef ParameterVector get_parameters();

    /** \brief Query the output Results
     *  @return an ngraph::ResultVector of all input parameters */
    public native @Const @ByRef ResultVector get_results();

    /** \brief Save this compiled Executable to an output stream.
     *     Saved stream may be read with Backend::load */
    public native void save(@Cast("std::ostream*") @ByRef Pointer output_stream);
}
