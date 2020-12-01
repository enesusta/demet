package com.github.enesusta.jtuples;

public final class Tuple5<A, B, C, D, E> {

    public final A _1;
    public final B _2;
    public final C _3;
    public final D _4;
    public final E _5;

    private Tuple5(final A _1,
                   final B _2,
                   final C _3,
                   final D _4,
                   final E _5) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
    }

    public static <A, B, C, D, E> Tuple5<A, B, C, D, E> from(final A _1,
                                                             final B _2,
                                                             final C _3,
                                                             final D _4,
                                                             final E _5) {
        return new Tuple5<>(_1, _2, _3, _4, _5);
    }
}
