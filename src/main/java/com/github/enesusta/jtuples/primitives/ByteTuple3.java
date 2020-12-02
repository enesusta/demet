package com.github.enesusta.jtuples.primitives;

public final class ByteTuple3 {

    public final byte _1;
    public final byte _2;
    public final byte _3;

    private ByteTuple3(final byte _1,
                       final byte _2,
                       final byte _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    public static ByteTuple3 from(final byte _1,
                                  final byte _2,
                                  final byte _3) {
        return new ByteTuple3(_1, _2, _3);
    }
}
