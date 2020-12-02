package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class IntTuple4 {

    public final int _1;
    public final int _2;
    public final int _3;
    public final int _4;

    private IntTuple4(final int _1,
                      final int _2,
                      final int _3,
                      final int _4) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    public static IntTuple4 from(final int _1,
                                 final int _2,
                                 final int _3,
                                 final int _4) {
        return new IntTuple4(_1, _2, _3, _4);
    }
}


