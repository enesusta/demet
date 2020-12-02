package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class IntTuple2 {

    public final int _1;
    public final int _2;

    private IntTuple2(final int _1,
                     final int _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static IntTuple2 from(final int _1,
                                 final int _2) {
        return new IntTuple2(_1, _2);
    }
}


