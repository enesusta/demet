package com.github.enesusta.jtuples.primitives;

import com.github.enesusta.jtuples.annotations.NotThreadSafe;

@NotThreadSafe
public final class IntTuple5 {

    public final int _1;
    public final int _2;
    public final int _3;
    public final int _4;
    public final int _5;

    private IntTuple5(final int _1,
                      final int _2,
                      final int _3,
                      final int _4,
                      final int _5) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
    }

    public static IntTuple5 from(final int _1,
                                 final int _2,
                                 final int _3,
                                 final int _4,
                                 final int _5) {
        return new IntTuple5(_1, _2, _3, _4, _5);
    }
}


