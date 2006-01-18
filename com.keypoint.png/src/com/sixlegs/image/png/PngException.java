// Copyright (C) 1998, 1999, 2001 Chris Nokleberg
// Please see included LICENSE.TXT

package com.sixlegs.image.png;

import java.io.IOException;

class PngException
extends IOException
{
	private static final long serialVersionUID = 1L;
	String msg = null;

    PngException()
    {
    }

    PngException(String s)
    {
        msg = s;
    }

    public String toString()
    {
        return msg;
    }
}

