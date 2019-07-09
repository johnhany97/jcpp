// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Restore a reader to a previously saved state.
 * 
 *  Not all Readers support being restored, so this can produce an
 *  Unimplemented error.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * reader_handle: Handle to a Reader.
 *  * state: Result of a ReaderSerializeState of a Reader with type
 *  matching reader_handle.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReaderRestoreState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReaderRestoreState(Pointer p) { super(p); }

  public ReaderRestoreState(@Const @ByRef Scope scope, @ByVal Input reader_handle, @ByVal Input state) { super((Pointer)null); allocate(scope, reader_handle, state); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input reader_handle, @ByVal Input state);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native ReaderRestoreState operation(Operation setter);
}
