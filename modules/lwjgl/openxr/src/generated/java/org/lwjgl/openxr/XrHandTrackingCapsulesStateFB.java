/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.openxr.FBHandTrackingCapsules.*;

/**
 * A list of capsules associated to hand joints.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHandTrackingCapsules XR_FB_hand_tracking_capsules} extension <b>must</b> be enabled prior to using {@link XrHandTrackingCapsulesStateFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBHandTrackingCapsules#XR_TYPE_HAND_TRACKING_CAPSULES_STATE_FB TYPE_HAND_TRACKING_CAPSULES_STATE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandCapsuleFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingCapsulesStateFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     {@link XrHandCapsuleFB XrHandCapsuleFB} {@link #capsules}[XR_FB_HAND_TRACKING_CAPSULE_COUNT];
 * }</code></pre>
 */
public class XrHandTrackingCapsulesStateFB extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CAPSULES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(XrHandCapsuleFB.SIZEOF, XrHandCapsuleFB.ALIGNOF, XR_FB_HAND_TRACKING_CAPSULE_COUNT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CAPSULES = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrHandTrackingCapsulesStateFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingCapsulesStateFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an array of capsules. */
    @NativeType("XrHandCapsuleFB[XR_FB_HAND_TRACKING_CAPSULE_COUNT]")
    public XrHandCapsuleFB.Buffer capsules() { return ncapsules(address()); }
    /** an array of capsules. */
    public XrHandCapsuleFB capsules(int index) { return ncapsules(address(), index); }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingCapsulesStateFB} instance for the specified memory address. */
    public static XrHandTrackingCapsulesStateFB create(long address) {
        return wrap(XrHandTrackingCapsulesStateFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingCapsulesStateFB createSafe(long address) {
        return address == NULL ? null : wrap(XrHandTrackingCapsulesStateFB.class, address);
    }

    /**
     * Create a {@link XrHandTrackingCapsulesStateFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingCapsulesStateFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingCapsulesStateFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingCapsulesStateFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingCapsulesStateFB.NEXT); }
    /** Unsafe version of {@link #capsules}. */
    public static XrHandCapsuleFB.Buffer ncapsules(long struct) { return XrHandCapsuleFB.create(struct + XrHandTrackingCapsulesStateFB.CAPSULES, XR_FB_HAND_TRACKING_CAPSULE_COUNT); }
    /** Unsafe version of {@link #capsules(int) capsules}. */
    public static XrHandCapsuleFB ncapsules(long struct, int index) {
        return XrHandCapsuleFB.create(struct + XrHandTrackingCapsulesStateFB.CAPSULES + check(index, XR_FB_HAND_TRACKING_CAPSULE_COUNT) * XrHandCapsuleFB.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link XrHandTrackingCapsulesStateFB} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingCapsulesStateFB, Buffer> {

        private static final XrHandTrackingCapsulesStateFB ELEMENT_FACTORY = XrHandTrackingCapsulesStateFB.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingCapsulesStateFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingCapsulesStateFB#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrHandTrackingCapsulesStateFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandTrackingCapsulesStateFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingCapsulesStateFB.ntype(address()); }
        /** @return the value of the {@link XrHandTrackingCapsulesStateFB#next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingCapsulesStateFB.nnext(address()); }
        /** @return a {@link XrHandCapsuleFB}.Buffer view of the {@link XrHandTrackingCapsulesStateFB#capsules} field. */
        @NativeType("XrHandCapsuleFB[XR_FB_HAND_TRACKING_CAPSULE_COUNT]")
        public XrHandCapsuleFB.Buffer capsules() { return XrHandTrackingCapsulesStateFB.ncapsules(address()); }
        /** @return a {@link XrHandCapsuleFB} view of the struct at the specified index of the {@link XrHandTrackingCapsulesStateFB#capsules} field. */
        public XrHandCapsuleFB capsules(int index) { return XrHandTrackingCapsulesStateFB.ncapsules(address(), index); }

    }

}