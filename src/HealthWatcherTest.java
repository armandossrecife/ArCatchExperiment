import arcatch.ArCatch;
import arcatch.dsl.element.ExceptionElement;
import arcatch.dsl.element.ModuleElement;

public class HealthWatcherTest {

	private static ModuleElement viL;

	private static ModuleElement diL;

	private static ModuleElement buL;

	private static ModuleElement daL;

	private static ExceptionElement daLEx;

	private static ExceptionElement buLEx;

	private static ExceptionElement diLEx;

	private static ExceptionElement allEx;

	private static ExceptionElement sqlEx;

	private static ExceptionElement svtEx;

	public static void main(String[] args) {
		int version = 10;
		switch (version) {
		case 1:
			checkHealthWatcher01("./hwsrc/HealthWatcherOO_01/src", "./hwbin/HealthWatcher01.jar");
			break;
		case 2:
			checkHealthWatcher02("./hwsrc/HealthWatcherOO_02/src", "./hwbin/HealthWatcher02.jar");
			break;
		case 3:
			checkHealthWatcher03("./hwsrc/HealthWatcherOO_03/src", "./hwbin/HealthWatcher03.jar");
			break;
		case 4:
			checkHealthWatcher04("./hwsrc/HealthWatcherOO_04/src", "./hwbin/HealthWatcher04.jar");
			break;
		case 5:
			checkHealthWatcher05("./hwsrc/HealthWatcherOO_05/src", "./hwbin/HealthWatcher05.jar");
			break;
		case 6:
			checkHealthWatcher06("./hwsrc/HealthWatcherOO_06/src", "./hwbin/HealthWatcher06.jar");
			break;
		case 7:
			checkHealthWatcher07("./hwsrc/HealthWatcherOO_07/src", "./hwbin/HealthWatcher07.jar");
			break;
		case 8:
			checkHealthWatcher08("./hwsrc/HealthWatcherOO_08/src", "./hwbin/HealthWatcher08.jar");
			break;
		case 9:
			checkHealthWatcher09("./hwsrc/HealthWatcherOO_09/src", "./hwbin/HealthWatcher09.jar");
			break;
		case 10:
			checkHealthWatcher10("./hwsrc/HealthWatcherOO_10/src", "./hwbin/HealthWatcher10.jar");
			break;
		default:
			break;
		}
	}

	private static void checkHealthWatcher01(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.servlets.[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch.element().module("DiL")
				.matching("(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.IFacade|healthwatcher.business.(HealthWatcherFacade|HealthWatcherFacadeInit))*").build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();
		check();

	}

	private static void checkHealthWatcher02(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch.element().module("DiL")
				.matching("(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.IFacade|healthwatcher.business.(HealthWatcherFacade|HealthWatcherFacadeInit))*").build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher03(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch.element().module("DiL")
				.matching("(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.IFacade|healthwatcher.business.(HealthWatcherFacade|HealthWatcherFacadeInit))*").build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher04(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch.element().module("DiL")
				.matching("(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.IFacade|healthwatcher.business.(HealthWatcherFacade|HealthWatcherFacadeInit))*").build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher05(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch
				.element()
				.module("DiL")
				.matching(
						"(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.(IFacade|RMIServletAdapter)|healthwatcher.business.(HealthWatcherFacade|IFacadeRMITargetAdapter|RMIFacadeAdapter))*")
				.build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher06(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch
				.element()
				.module("DiL")
				.matching(
						"(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.(IFacade|RMIServletAdapter)|healthwatcher.business.(HealthWatcherFacade|IFacadeRMITargetAdapter|RMIFacadeAdapter))*")
				.build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher07(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch
				.element()
				.module("DiL")
				.matching(
						"(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.(IFacade|RMIServletAdapter)|healthwatcher.business.(HealthWatcherFacade|IFacadeRMITargetAdapter|RMIFacadeAdapter))*")
				.build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher08(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch
				.element()
				.module("DiL")
				.matching(
						"(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.(IFacade|RMIServletAdapter)|healthwatcher.business.(factories.[a-zA-Z_$][a-zA-Z0-9_$]*|HealthWatcherFacade|IFacadeRMITargetAdapter|RMIFacadeAdapter|HWServer))*")
				.build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher09(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch
				.element()
				.module("DiL")
				.matching(
						"(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.(IFacade|RMIServletAdapter)|healthwatcher.business.(factories.[a-zA-Z_$][a-zA-Z0-9_$]*|HealthWatcherFacade|IFacadeRMITargetAdapter|RMIFacadeAdapter|HWServer))*")
				.build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.CommunicationException)*").build();

		daLEx = ArCatch.element().exception("DaLEx").matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void checkHealthWatcher10(String srcPath, String binPath) {
		ArCatch.config(srcPath, binPath);

		viL = ArCatch.element().module("ViL").matching("healthwatcher.view.(servlets|command).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diL = ArCatch
				.element()
				.module("DiL")
				.matching(
						"(lib.distribution.rmi.[a-zA-Z_$][a-zA-Z0-9_$]*|healthwatcher.view.(IFacade|RMIServletAdapter)|healthwatcher.business.(factories.[a-zA-Z_$][a-zA-Z0-9_$]*|HealthWatcherFacade|IFacadeRMITargetAdapter|RMIFacadeAdapter|HWServer))*")
				.build();

		buL = ArCatch.element().module("BuL").matching("healthwatcher.business.(complaint|employee|healthguide|factories).[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		daL = ArCatch.element().module("DaL").matching("(healthwatcher.data|lib.persistence).([a-zA-Z_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		buLEx = ArCatch.element().exception("BuLEx").matching("lib.exceptions.(ObjectAlready)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		diLEx = ArCatch.element().exception("DiLEx").matching("(java.rmi.RemoteException|lib.exceptions.(CommunicationException|FacadeUnavailableException))*").build();

		daLEx = ArCatch.element().exception("DaLEx")
				.matching("lib.exceptions.(Persistence|ObjectNot|Repository|Transaction|SQLPersistenceMechanism|ConnectionPersistenceMechanism)[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		sqlEx = ArCatch.element().exception("SQLEx").matching("java.sql.SQLException").build();

		svtEx = ArCatch.element().exception("SVTEx").matching("javax.servlet.ServletException").build();

		allEx = ArCatch.element().exception("AllEx").matching("lib.exceptions.([a-zA-Z0-9_$][a-zA-Z0-9_$]*.)*[a-zA-Z_$][a-zA-Z0-9_$]*").build();

		check();
	}

	private static void check() {
		ArCatch.checker().addRule(ArCatch.rule().module(viL).mustHandle(diLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(viL).canSignal(svtEx).build());
		ArCatch.checker().addRule(ArCatch.rule().module(viL).cannotSignal(allEx).build());

		ArCatch.checker().addRule(ArCatch.rule().only(diL).canRaise(diLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(diL).canSignal(diLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().module(diL).mustHandle(buLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(diL).canRemap(buLEx).to(diLEx).build());

		ArCatch.checker().addRule(ArCatch.rule().only(buL).canRaise(buLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(buL).canSignal(buLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().module(buL).mustHandle(daLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(buL).canRemap(daLEx).to(buLEx).build());

		ArCatch.checker().addRule(ArCatch.rule().only(daL).canRaise(daLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(daL).canSignal(daLEx).build());
		ArCatch.checker().addRule(ArCatch.rule().only(daL).canHandle(sqlEx).build());
		ArCatch.checker().addRule(ArCatch.rule().module(daL).cannotSignal(sqlEx).build());

		ArCatch.checker().addRule(ArCatch.rule().exception(daLEx).cannotFlow(daL, buL, diL).build());

		ArCatch.checker().checkAll();

	}
}