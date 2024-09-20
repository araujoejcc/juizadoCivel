package controllers;

import models.DanosMateriais;
import models.DanosMorais;
import models.Dispositivo;
import models.Fundamentacao;
import models.Gratuidade;
import models.PedidoContraposto;
import models.PedidoPrincipal;
import models.Preliminares;
import models.Queixa;
import models.Recolhimento;
import models.RelacaoJuridica;
import models.Solidariedade;
import models.TeoriaFinalista;
import models.TipoDeJulgamento;

public class Sentenca {

//	record String preliminares = new String();
	
	// Atributos da sentença	
	
	private Gratuidade gratuidade = new Gratuidade();
	private Queixa queixa = new Queixa();
	private PedidoPrincipal pedidoPrincipal = new PedidoPrincipal();
	private PedidoContraposto pedidoContraposto = new PedidoContraposto();
	private Preliminares preliminares = new Preliminares();
	private TeoriaFinalista teoriaFinalista = new TeoriaFinalista();
	private RelacaoJuridica relacaoJuridica = new RelacaoJuridica();
	private Solidariedade solidariedade = new Solidariedade();
	private Fundamentacao fundamentacao = new Fundamentacao();
	private DanosMateriais danosMateriais = new DanosMateriais();
	private DanosMorais danosMorais = new DanosMorais();
	private TipoDeJulgamento tipoDeJulgamento = new TipoDeJulgamento();
	private Dispositivo dispositivo;
	private Recolhimento recolhimento = new Recolhimento();
	
	{
		System.out.println("SENTENÇA"
				+"\n"
				+"\n"
				+ "Vistos etc.\n"
				+ "Dispensado o relatório, nos termos do art. 38 da Lei nº 9.099/1995.\n"
				+ "O demandante narrou o conflito da seguinte maneira:\n"
				+ queixa.getTextoQueixa()+ "\n"
				+ "Ao final, requereu o provimento jurisdicional para:\n"
				+ pedidoPrincipal.getTextoPedidoPrincipal() + "\n"
				+ pedidoContraposto.getTextoContraposto() + "\n"
				+ preliminares.getTextoPreliminares() + "\n"
				+ teoriaFinalista.getTextoTeoriaFinalista() + "\n"
				+ relacaoJuridica.getTextoRelacaoJuridica() + "\n"
				+ solidariedade.getTextoSolidariedade() + "\n"
				+ fundamentacao.getTextoFundamentacao() + "\n"
				+ danosMateriais.getTextoDanosMateriais() + "\n"
				+ danosMorais.getTextoDanosMorais() + "\n"
				+ tipoDeJulgamento.getTextoTipoDeJulgamento()
				+ "{DISPOSITIVO}\n"
				+ recolhimento.getTextoRecolhimento() + "\n"
				+ "\n"
				+ "Sem custas ou honorários, nos termos do art. 55 da Lei nº 9.099/1995.\n"
				+ "\n"
				+ gratuidade.getTextoGratuidade() + "\n"
				+ "\n"
				+ "Publique-se. Registre-se. Partes cientes e intimadas em audiência.\n"
				+ "Após o trânsito em julgado, arquive-se o processo.\n"
				+ "\n"
				+ "Olinda, ______ de ______________ de _______________.\n"
				+ "\n"
				+ "\n"
				+ "ÍGOR DA SILVA RÊGO\n"
				+ "JUIZ DE DIREITO");		
	}
}