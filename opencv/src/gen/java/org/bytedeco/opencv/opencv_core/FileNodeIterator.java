// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;



/** \brief used to iterate through sequences and mappings.
 <p>
 A standard STL notation, with node.begin(), node.end() denoting the beginning and the end of a
 sequence, stored in node. See the data reading sample in the beginning of the section.
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class FileNodeIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileNodeIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileNodeIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FileNodeIterator position(long position) {
        return (FileNodeIterator)super.position(position);
    }

    /** \brief The constructors.
     <p>
     These constructors are used to create a default iterator, set it to specific element in a file node
     or construct it from another iterator.
     */
    public FileNodeIterator() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
     @param node File node - the collection to iterate over;
        it can be a scalar (equivalent to 1-element collection) or "none" (equivalent to empty collection).
     @param seekEnd - true if iterator needs to be set after the last element of the node;
        that is:
            * node.begin() => FileNodeIterator(node, false)
            * node.end() => FileNodeIterator(node, true)
     */
    public FileNodeIterator(@Const @ByRef FileNode node, @Cast("bool") boolean seekEnd) { super((Pointer)null); allocate(node, seekEnd); }
    private native void allocate(@Const @ByRef FileNode node, @Cast("bool") boolean seekEnd);

    /** \overload
     @param it Iterator to be used as initialization for the created iterator.
     */
    public FileNodeIterator(@Const @ByRef FileNodeIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef FileNodeIterator it);

    /** returns the currently observed element */
    public native @ByVal @Name("operator *") FileNode multiply();

    /** moves iterator to the next node */
    public native @ByRef @Name("operator ++") FileNodeIterator increment();
    /** moves iterator to the next node */
    public native @ByVal @Name("operator ++") FileNodeIterator increment(int arg0);
    /** moves iterator forward by the specified offset (possibly negative) */
    public native @ByRef @Name("operator +=") FileNodeIterator addPut(int ofs);

    /** \brief Reads node elements to the buffer with the specified format.
     <p>
     Usually it is more convenient to use operator {@code >>} instead of this method.
     @param fmt Specification of each array element. See \ref format_spec "format specification"
     @param vec Pointer to the destination array.
     @param maxCount Number of elements to read. If it is greater than number of remaining elements then
     all of them will be read.
     */
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, Pointer vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str BytePointer fmt, Pointer vec );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, Pointer vec,
                                   @Cast("size_t") long maxCount/*=(size_t)INT_MAX*/ );
    public native @ByRef FileNodeIterator readRaw( @Str String fmt, Pointer vec );

    /** returns the number of remaining (not read yet) elements */
    public native @Cast("size_t") long remaining();

    public native @Cast("bool") boolean equalTo(@Const @ByRef FileNodeIterator it);
}
