// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Decodes a string into sequences of strings (which may represent serialized
// protocol buffers). Normal usage involves a single call to ReadSizes() in
// order to retrieve the length of all the strings in the sequence. For each
// size returned a call to Data() is expected and will return the actual
// string.
@Namespace("tensorflow::port") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringListDecoder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringListDecoder(Pointer p) { super(p); }


  // Populates the given vector with the lengths of each string in the sequence
  // being decoded. Upon returning the vector is guaranteed to contain as many
  // elements as there are strings in the sequence.
  public native @Cast("bool") boolean ReadSizes(@Cast("tensorflow::uint32*") @StdVector IntPointer sizes);
  public native @Cast("bool") boolean ReadSizes(@Cast("tensorflow::uint32*") @StdVector IntBuffer sizes);
  public native @Cast("bool") boolean ReadSizes(@Cast("tensorflow::uint32*") @StdVector int... sizes);

  // Returns a pointer to the next string in the sequence, then prepares for the
  // next call by advancing 'size' characters in the sequence.
  public native @Cast("const char*") BytePointer Data(@Cast("tensorflow::uint32") int size);
}
