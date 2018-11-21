window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BuscarAvaliacao = window.blockly.js.blockly.BuscarAvaliacao
		|| {};

/**
 * buscarAvaliacao
 */
window.blockly.js.blockly.BuscarAvaliacao.avaliar = function() {

	var comentario, nota;
	nota = this.cronapi.screen.getValueOfField("vars.nota");
	comentario = this.cronapi.screen.getValueOfField("vars.comentario");
	this.cronapi.util.callServerBlocklyNoReturn('blockly.Avaliar:avaliar',
			comentario, nota);
}
