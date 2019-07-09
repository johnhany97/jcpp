// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Writes contents to the file at input filename. Creates file and recursively
 * 
 *  creates directory if not existing.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * filename: scalar. The name of the file to which we write the contents.
 *  * contents: scalar. The content to be written to the output file.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class WriteFile extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WriteFile(Pointer p) { super(p); }

  public WriteFile(@Const @ByRef Scope scope, @ByVal Input filename,
            @ByVal Input contents) { super((Pointer)null); allocate(scope, filename, contents); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input filename,
            @ByVal Input contents);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native WriteFile operation(Operation setter);
}
