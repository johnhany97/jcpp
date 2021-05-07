// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::io") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class RandomAccessFile extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomAccessFile(Pointer p) { super(p); }
    public InputStream asInputStream() { return asInputStream(this); }
    @Namespace public static native @Name("static_cast<arrow::io::InputStream*>") InputStream asInputStream(RandomAccessFile pointer);
    public Seekable asSeekable() { return asSeekable(this); }
    @Namespace public static native @Name("static_cast<arrow::io::Seekable*>") Seekable asSeekable(RandomAccessFile pointer);

  /** Necessary because we hold a std::unique_ptr */

  /** \brief Create an isolated InputStream that reads a segment of a
   *  RandomAccessFile. Multiple such stream can be created and used
   *  independently without interference
   *  @param file [in] a file instance
   *  @param file_offset [in] the starting position in the file
   *  @param nbytes [in] the extent of bytes to read. The file should have
   *  sufficient bytes available */
  
  ///
  public static native @SharedPtr @Cast({"", "std::shared_ptr<arrow::io::InputStream>"}) InputStream GetStream(@SharedPtr @Cast({"", "std::shared_ptr<arrow::io::RandomAccessFile>"}) RandomAccessFile file,
                                                  @Cast("int64_t") long file_offset, @Cast("int64_t") long nbytes);

  /** \brief Return the total file size in bytes.
   * 
   *  This method does not read or move the current file position, so is safe
   *  to call concurrently with e.g. ReadAt(). */
  
  ///
  ///
  ///
  ///
  public native @ByVal LongResult GetSize();

  /** \brief Read data from given file position.
   * 
   *  At most {@code nbytes} bytes are read.  The number of bytes read is returned
   *  (it can be less than {@code nbytes} if EOF is reached).
   * 
   *  This method can be safely called from multiple threads concurrently.
   *  It is unspecified whether this method updates the file position or not.
   * 
   *  The default RandomAccessFile-provided implementation uses Seek() and Read(),
   *  but subclasses may override it with a more efficient implementation
   *  that doesn't depend on implicit file positioning.
   * 
   *  @param position [in] Where to read bytes from
   *  @param nbytes [in] The number of bytes to read
   *  @param out [out] The buffer to read bytes into
   *  @return The number of bytes read, or an error */
  
  ///
  ///
  public native @ByVal LongResult ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes, Pointer out);

  /** \brief Read data from given file position.
   * 
   *  At most {@code nbytes} bytes are read, but it can be less if EOF is reached.
   * 
   *  @param position [in] Where to read bytes from
   *  @param nbytes [in] The number of bytes to read
   *  @return A buffer containing the bytes read, or an error */
  public native @ByVal BufferResult ReadAt(@Cast("int64_t") long _position, @Cast("int64_t") long nbytes);

  /** EXPERIMENTAL: Read data asynchronously. */
  

  /** EXPERIMENTAL: Read data asynchronously, using the file's IOContext. */
  

  /** EXPERIMENTAL: Inform that the given ranges may be read soon.
   * 
   *  Some implementations might arrange to prefetch some of the data.
   *  However, no guarantee is made and the default implementation does nothing.
   *  For robust prefetching, use ReadAt() or ReadAsync(). */
  public native @ByVal Status WillNeed(@StdVector ReadRange ranges);
}
