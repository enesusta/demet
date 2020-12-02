package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class DoubleTuple2 {

    public final double _1;
    public final double _2;

    private DoubleTuple2(final double _1,
                         final double _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static DoubleTuple2 from(final double _1,
                                    final double _2) {
        return new DoubleTuple2(_1, _2);
    }
}
