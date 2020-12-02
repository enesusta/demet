package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class IntTuple3 {

    public final int _1;
    public final int _2;
    public final int _3;

    private IntTuple3(final int _1,
                      final int _2,
                      final int _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    public static IntTuple3 from(final int _1,
                                 final int _2,
                                 final int _3) {
        return new IntTuple3(_1, _2, _3);
    }
}


