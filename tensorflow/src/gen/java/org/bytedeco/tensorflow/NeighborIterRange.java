// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// A range adaptor for a pair of iterators.
//
// This just wraps two iterators into a range-compatible interface. Nothing
// fancy at all.
@Name("tensorflow::gtl::iterator_range<tensorflow::NeighborIter>") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NeighborIterRange extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NeighborIterRange(Pointer p) { super(p); }


  
  public NeighborIterRange(@ByVal NeighborIter begin_iterator, @ByVal NeighborIter end_iterator) { super((Pointer)null); allocate(begin_iterator, end_iterator); }
  private native void allocate(@ByVal NeighborIter begin_iterator, @ByVal NeighborIter end_iterator);

  public native @ByVal NeighborIter begin();
  public native @ByVal NeighborIter end();
}
