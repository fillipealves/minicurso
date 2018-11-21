package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Avaliar {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param comentario
	 * @param nota
	 */
	// Descreva esta função...
	public static void avaliar(Var comentario, Var nota) throws Exception {
		new Callable<Var>() {

			private Var except = Var.VAR_NULL;

			public Var call() throws Exception {
				try {
					cronapi.database.Operations.insert(Var.valueOf("app.entity.avaliacao"),
							Var.valueOf("texto", comentario),
							Var.valueOf("usuario", cronapi.util.Operations.getCurrentUserName()),
							Var.valueOf("nota", nota));
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("success"), Var.valueOf("Avaliação salva com sucesso!"));
				} catch (Exception except_exception) {
					except = Var.valueOf(except_exception);
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("error"), Var.valueOf("Erro ao avaliar!"));
				} finally {
				}
				return Var.VAR_NULL;
			}
		}.call();
	}

}
