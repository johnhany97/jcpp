// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Opaque @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TBLOB extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TBLOB() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TBLOB(Pointer p) { super(p); }
}
