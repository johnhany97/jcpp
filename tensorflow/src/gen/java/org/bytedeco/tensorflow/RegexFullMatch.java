// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Check if the input matches the regex pattern.
 * 
 *  The input is a string tensor of any shape. The pattern is a scalar
 *  string tensor which is applied to every element of the input tensor.
 *  The boolean values (True or False) of the output tensor indicate
 *  if the input matches the regex pattern provided.
 * 
 *  The pattern follows the re2 syntax (https://github.com/google/re2/wiki/Syntax)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A string tensor of the text to be processed.
 *  * pattern: A scalar string tensor containing the regular expression to match the input.
 * 
 *  Returns:
 *  * {@code Output}: A bool tensor with the same shape as {@code input}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RegexFullMatch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegexFullMatch(Pointer p) { super(p); }

  public RegexFullMatch(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input pattern) { super((Pointer)null); allocate(scope, input, pattern); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input pattern);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native RegexFullMatch operation(Operation setter);
  public native @ByRef Output output(); public native RegexFullMatch output(Output setter);
}
