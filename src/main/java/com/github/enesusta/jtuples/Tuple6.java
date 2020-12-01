package com.github.enesusta.jtuples;

public final class Tuple6<A, B, C, D, E, F> {

    public final A _1;
    public final B _2;
    public final C _3;
    public final D _4;
    public final E _5;
    public final F _6;

    private Tuple6(final A _1,
                   final B _2,
                   final C _3,
                   final D _4,
                   final E _5,
                   final F _6) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
    }

    public static <A, B, C, D, E, F> Tuple6<A, B, C, D, E, F> from(final A _1,
                                                                   final B _2,
                                                                   final C _3,
                                                                   final D _4,
                                                                   final E _5,
                                                                   final F _6) {
        return new Tuple6<>(_1, _2, _3, _4, _5, _6);
    }
}