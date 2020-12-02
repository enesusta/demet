package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class IntTuple6 {

    public final int _1;
    public final int _2;
    public final int _3;
    public final int _4;
    public final int _5;
    public final int _6;

    private IntTuple6(final int _1,
                      final int _2,
                      final int _3,
                      final int _4,
                      final int _5,
                      final int _6) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
    }

    public static IntTuple6 from(final int _1,
                                 final int _2,
                                 final int _3,
                                 final int _4,
                                 final int _5,
                                 final int _6) {
        return new IntTuple6(_1, _2, _3, _4, _5, _6);
    }
}


