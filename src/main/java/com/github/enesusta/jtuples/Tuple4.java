package com.github.enesusta.jtuples;

public final class Tuple4<A, B, C, D> {

    public final A _1;
    public final B _2;
    public final C _3;
    public final D _4;

    private Tuple4(final A _1,
                   final B _2,
                   final C _3,
                   final D _4) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    public static <A, B, C, D> Tuple4<A, B, C, D> from(final A _1,
                                                       final B _2,
                                                       final C _3,
                                                       final D _4) {
        return new Tuple4<>(_1, _2, _3, _4);
    }
}

