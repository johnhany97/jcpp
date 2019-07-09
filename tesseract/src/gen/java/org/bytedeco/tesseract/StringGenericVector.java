// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Name("GenericVector<STRING>") @NoOffset @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class StringGenericVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringGenericVector(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringGenericVector(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringGenericVector position(long position) {
        return (StringGenericVector)super.position(position);
    }

  public StringGenericVector() { super((Pointer)null); allocate(); }
  private native void allocate();
  public StringGenericVector(int size, @Const @ByRef STRING init_val) { super((Pointer)null); allocate(size, init_val); }
  private native void allocate(int size, @Const @ByRef STRING init_val);

  // Copy
  public StringGenericVector(@Const @ByRef StringGenericVector other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef StringGenericVector other);
  public native @ByRef @Name("operator +=") StringGenericVector addPut(@Const @ByRef StringGenericVector other);
  public native @ByRef @Name("operator =") StringGenericVector put(@Const @ByRef StringGenericVector other);

  // Reserve some memory.
  public native void reserve(int size);
  // Double the size of the internal array.
  public native void double_the_size();

  // Resizes to size and sets all values to t.
  public native void init_to_size(int size, @Const @ByRef STRING t);
  // Resizes to size without any initialization.
  public native void resize_no_init(int size);

  // Return the size used.
  public native int size();
  // Workaround to avoid g++ -Wsign-compare warnings.
  public native @Cast("size_t") long unsigned_size();
  public native int size_reserved();

  public native int length();

  // Return true if empty.
  public native @Cast("bool") boolean empty();

  // Return the object from an index.
  public native @ByRef STRING get(int index);
  public native @ByRef STRING back();
  // Returns the last object and removes it.
  public native @ByVal STRING pop_back();

  // Return the index of the T object.
  // This method NEEDS a compare_callback to be passed to
  // set_compare_callback.
  public native int get_index(@Const @ByRef STRING object);

  // Return true if T is in the array
  public native @Cast("bool") boolean contains(@Const @ByRef STRING object);

  // Return true if the index is valid
  

  // Push an element in the end of the array
  public native int push_back(@ByVal STRING object);
  public native @Name("operator +=") void addPut(@Const @ByRef STRING t);

  // Push an element in the end of the array if the same
  // element is not already contained in the array.
  public native int push_back_new(@Const @ByRef STRING object);

  // Push an element in the front of the array
  // Note: This function is O(n)
  public native int push_front(@Const @ByRef STRING object);

  // Set the value at the given index
  public native void set(@Const @ByRef STRING t, int index);

  // Insert t at the given index, push other elements to the right.
  public native void insert(@Const @ByRef STRING t, int index);

  // Removes an element at the given index and
  // shifts the remaining elements to the left.
  public native void remove(int index);

  // Truncates the array to the given size by removing the end.
  // If the current size is less, the array is not expanded.
  public native void truncate(int size);

  // Add a callback to be called to delete the elements when the array took
  // their ownership.
  public native void set_clear_callback(StringClearCallback cb);

  // Add a callback to be called to compare the elements when needed (contains,
  // get_id, ...)
  public native void set_compare_callback(StringCompareCallback cb);

  // Clear the array, calling the clear callback function if any.
  // All the owned callbacks are also deleted.
  // If you don't want the callbacks to be deleted, before calling clear, set
  // the callback to nullptr.
  public native void clear();

  // Delete objects pointed to by data_[i]
  

  // This method clears the current object, then, does a shallow copy of
  // its argument, and finally invalidates its argument.
  // Callbacks are moved to the current object;
  public native void move(StringGenericVector from);

  // Read/Write the array to a file. This does _NOT_ read/write the callbacks.
  // The callback given must be permanent since they will be called more than
  // once. The given callback will be deleted at the end.
  // If the callbacks are nullptr, then the data is simply read/written using
  // fread (and swapping)/fwrite.
  // Returns false on error or if the callback returns false.
  // DEPRECATED. Use [De]Serialize[Classes] instead.
  public native @Cast("bool") boolean write(@Cast("FILE*") Pointer f, StringWriteCallback cb);
  public native @Cast("bool") boolean read(TFile f,
              StringReadCallback cb);
  // Writes a vector of simple types to the given file. Assumes that bitwise
  // read/write of T will work. Returns false in case of error.
  // TODO(rays) Change all callers to use TFile and remove deprecated methods.
  public native @Cast("bool") boolean Serialize(@Cast("FILE*") Pointer fp);
  public native @Cast("bool") boolean Serialize(TFile fp);
  // Reads a vector of simple types from the given file. Assumes that bitwise
  // read/write will work with ReverseN according to sizeof(T).
  // Returns false in case of error.
  // If swap is true, assumes a big/little-endian swap is needed.
  // TFile is assumed to know about swapping.
  public native @Cast("bool") boolean DeSerialize(@Cast("bool") boolean swap, @Cast("FILE*") Pointer fp);
  public native @Cast("bool") boolean DeSerialize(TFile fp);
  // Skips the deserialization of the vector.
  public static native @Cast("bool") boolean SkipDeSerialize(TFile fp);
  // Writes a vector of classes to the given file. Assumes the existence of
  // bool T::Serialize(FILE* fp) const that returns false in case of error.
  // Returns false in case of error.
  public native @Cast("bool") boolean SerializeClasses(@Cast("FILE*") Pointer fp);
  public native @Cast("bool") boolean SerializeClasses(TFile fp);
  // Reads a vector of classes from the given file. Assumes the existence of
  // bool T::Deserialize(bool swap, FILE* fp) that returns false in case of
  // error. Also needs T::T() and T::T(constT&), as init_to_size is used in
  // this function. Returns false in case of error.
  // If swap is true, assumes a big/little-endian swap is needed.
  public native @Cast("bool") boolean DeSerializeClasses(@Cast("bool") boolean swap, @Cast("FILE*") Pointer fp);
  public native @Cast("bool") boolean DeSerializeClasses(TFile fp);
  // Calls SkipDeSerialize on the elements of the vector.
  public static native @Cast("bool") boolean SkipDeSerializeClasses(TFile fp);

  // Allocates a new array of double the current_size, copies over the
  // information from data to the new location, deletes data and returns
  // the pointed to the new larger array.
  // This function uses memcpy to copy the data, instead of invoking
  // operator=() for each element like double_the_size() does.
  public static native STRING double_the_size_memcpy(int current_size, STRING data);

  // Reverses the elements of the vector.
  public native void reverse();

  // Sorts the members of this vector using the less than comparator (cmp_lt),
  // which compares the values. Useful for GenericVectors to primitive types.
  // Will not work so great for pointers (unless you just want to sort some
  // pointers). You need to provide a specialization to sort_cmp to use
  // your type.
  

  // Sort the array into the order defined by the qsort function comparator.
  // The comparator function is as defined by qsort, ie. it receives pointers
  // to two Ts and returns negative if the first element is to appear earlier
  // in the result and positive if it is to appear later, with 0 for equal.
  

  // Searches the array (assuming sorted in ascending order, using sort()) for
  // an element equal to target and returns true if it is present.
  // Use binary_search to get the index of target, or its nearest candidate.
  
  // Searches the array (assuming sorted in ascending order, using sort()) for
  // an element equal to target and returns the index of the best candidate.
  // The return value is conceptually the largest index i such that
  // data_[i] <= target or 0 if target < the whole vector.
  // NOTE that this function uses operator> so really the return value is
  // the largest index i such that data_[i] > target is false.
  

  // Compact the vector by deleting elements using operator!= on basic types.
  // The vector must be sorted.
  public native void compact_sorted();

  // Compact the vector by deleting elements for which delete_cb returns
  // true. delete_cb is a permanent callback and will be deleted.
  public native void compact(DeleteCallback delete_cb);

  

  // Returns the index of what would be the target_index_th item in the array
  // if the members were sorted, without actually sorting. Members are
  // shuffled around, but it takes O(n) time.
  // NOTE: uses operator< and operator== on the members.
  

  // Swaps the elements with the given indices.
  public native void swap(int index1, int index2);
  // Returns true if all elements of *this are within the given range.
  // Only uses operator<
  
}
