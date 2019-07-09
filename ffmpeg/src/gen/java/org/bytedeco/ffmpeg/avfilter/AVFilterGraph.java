// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterGraph extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterGraph() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterGraph(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterGraph(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterGraph position(long position) {
        return (AVFilterGraph)super.position(position);
    }

    public native @Const AVClass av_class(); public native AVFilterGraph av_class(AVClass setter);
    public native AVFilterContext filters(int i); public native AVFilterGraph filters(int i, AVFilterContext setter);
    public native @Cast("AVFilterContext**") PointerPointer filters(); public native AVFilterGraph filters(PointerPointer setter);
    public native @Cast("unsigned") int nb_filters(); public native AVFilterGraph nb_filters(int setter);

    /** sws options to use for the auto-inserted scale filters */
    public native @Cast("char*") BytePointer scale_sws_opts(); public native AVFilterGraph scale_sws_opts(BytePointer setter);
// #if FF_API_LAVR_OPTS
    /** libavresample options to use for the auto-inserted resample filters */
    public native @Cast("char*") @Deprecated BytePointer resample_lavr_opts(); public native AVFilterGraph resample_lavr_opts(BytePointer setter);
// #endif

    /**
     * Type of multithreading allowed for filters in this graph. A combination
     * of AVFILTER_THREAD_* flags.
     *
     * May be set by the caller at any point, the setting will apply to all
     * filters initialized after that. The default is allowing everything.
     *
     * When a filter in this graph is initialized, this field is combined using
     * bit AND with AVFilterContext.thread_type to get the final mask used for
     * determining allowed threading types. I.e. a threading type needs to be
     * set in both to be allowed.
     */
    public native int thread_type(); public native AVFilterGraph thread_type(int setter);

    /**
     * Maximum number of threads used by filters in this graph. May be set by
     * the caller before adding any filters to the filtergraph. Zero (the
     * default) means that the number of threads is determined automatically.
     */
    public native int nb_threads(); public native AVFilterGraph nb_threads(int setter);

    /**
     * Opaque object for libavfilter internal use.
     */
    public native AVFilterGraphInternal internal(); public native AVFilterGraph internal(AVFilterGraphInternal setter);

    /**
     * Opaque user data. May be set by the caller to an arbitrary value, e.g. to
     * be used from callbacks like \ref AVFilterGraph.execute.
     * Libavfilter will not touch this field in any way.
     */
    public native Pointer opaque(); public native AVFilterGraph opaque(Pointer setter);

    /**
     * This callback may be set by the caller immediately after allocating the
     * graph and before adding any filters to it, to provide a custom
     * multithreading implementation.
     *
     * If set, filters with slice threading capability will call this callback
     * to execute multiple jobs in parallel.
     *
     * If this field is left unset, libavfilter will use its internal
     * implementation, which may or may not be multithreaded depending on the
     * platform and build options.
     */
    public native avfilter_execute_func execute(); public native AVFilterGraph execute(avfilter_execute_func setter);

    /** swr options to use for the auto-inserted aresample filters, Access ONLY through AVOptions */
    public native @Cast("char*") BytePointer aresample_swr_opts(); public native AVFilterGraph aresample_swr_opts(BytePointer setter);

    /**
     * Private fields
     *
     * The following fields are for internal use only.
     * Their type, offset, number and semantic can change without notice.
     */

    public native AVFilterLink sink_links(int i); public native AVFilterGraph sink_links(int i, AVFilterLink setter);
    public native @Cast("AVFilterLink**") PointerPointer sink_links(); public native AVFilterGraph sink_links(PointerPointer setter);
    public native int sink_links_count(); public native AVFilterGraph sink_links_count(int setter);

    public native @Cast("unsigned") int disable_auto_convert(); public native AVFilterGraph disable_auto_convert(int setter);
}
