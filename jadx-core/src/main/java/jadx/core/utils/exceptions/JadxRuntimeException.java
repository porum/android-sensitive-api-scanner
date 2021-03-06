package jadx.core.utils.exceptions;

import jadx.api.ICodeWriter;
import jadx.core.utils.Utils;

import java.util.Arrays;

public class JadxRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -7410848445429898248L;

	public JadxRuntimeException(String message) {
		super(message);
	}

	public JadxRuntimeException(String... lines) {
		super(Utils.listToString(Arrays.asList(lines), ICodeWriter.NL + "  "));
	}

	public JadxRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
}
