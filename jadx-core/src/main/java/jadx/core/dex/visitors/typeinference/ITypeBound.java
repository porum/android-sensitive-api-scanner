package jadx.core.dex.visitors.typeinference;

import jadx.core.dex.instructions.args.ArgType;
import jadx.core.dex.instructions.args.RegisterArg;
import org.jetbrains.annotations.Nullable;

/**
 * Information to restrict types by applying constraints (or boundaries)
 */
public interface ITypeBound {

	BoundEnum getBound();

	ArgType getType();

	@Nullable
	RegisterArg getArg();
}
