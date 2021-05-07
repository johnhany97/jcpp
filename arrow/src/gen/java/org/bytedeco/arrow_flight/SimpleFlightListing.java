// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief A FlightListing implementation based on a vector of
 *  FlightInfo objects.
 * 
 *  This can be iterated once, then it is consumed. */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class SimpleFlightListing extends FlightListing {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleFlightListing(Pointer p) { super(p); }

  public SimpleFlightListing(@StdVector FlightInfo flights) { super((Pointer)null); allocate(flights); }
  private native void allocate(@StdVector FlightInfo flights);

  public native @ByVal Status Next(@UniquePtr FlightInfo info);
}
