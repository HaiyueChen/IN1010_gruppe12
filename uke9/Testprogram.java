public class Testprogram {
	public static void main(String[] args) {
		Lenkeliste<String> liste = new Lenkeliste<>();

		int intreturverdi;
		String strengreturverdi;
		intreturverdi = liste.leggTil("1");
		testIntRetur("Tester leggTil(1)", liste.leggTil("1"), 0);
		testIntRetur("Tester leggTil(2)", liste.leggTil("2"), 1);
		testIntRetur("Tester leggTil(3)", liste.leggTil("3"), 2);
		// System.out.print("Tester leggTil(1)");
		// if (intreturverdi == 0) {
		// 	System.out.println(": RIKTIG");
		// } else {
		// 	System.out.println(": FEIL, forventet 0, men fikk " + intreturverdi);
		// }

		// intreturverdi = liste.leggTil("2");

		// System.out.print("Tester leggTil(2)");
		// if (intreturverdi == 1) {
		// 	System.out.println(": RIKTIG");
		// } else {
		// 	System.out.println(": FEIL, forventet 1, men fikk " + intreturverdi);
		// }

		// intreturverdi = liste.leggTil("3");

		// System.out.print("Tester leggTil(3)");
		// if (intreturverdi == 2) {
		// 	System.out.println(": RIKTIG");
		// } else {
		// 	System.out.println(": FEIL, forventet 2, men fikk " + intreturverdi);
		// }


		testStringRetur("Tester hent(0)", liste.hent(0), "1");
		testStringRetur("Tester hent(1)", liste.hent(1), "2");
		testStringRetur("Tester hent(2)", liste.hent(2), "3");
		// strengreturverdi = liste.hent(0);

		// System.out.print("Tester hent(0)");
		// if (strengreturverdi.equals("1")) {
		// 	System.out.println(": RIKTIG");
		// } else {
		// 	System.out.println(": FEIL, forventet 1, men fikk " + strengreturverdi);
		// }

		// strengreturverdi = liste.hent(1);

		// System.out.print("Tester hent(1)");
		// if (strengreturverdi.equals("2")) {
		// 	System.out.println(": RIKTIG");
		// } else {
		// 	System.out.println(": FEIL, forventet 2, men fikk " + strengreturverdi);
		// }

		// strengreturverdi = liste.hent(2);

		// System.out.print("Tester hent(2)");
		// if (strengreturverdi.equals("3")) {
		// 	System.out.println(": RIKTIG");
		// } else {
		// 	System.out.println(": FEIL, forventet 3, men fikk " + strengreturverdi);
		// }
	}

	public static void testIntRetur(String testDesc, int returVerdi, int forventet){
		System.out.print(testDesc);
		if(returVerdi == forventet){
			// return "Riktig";
			System.out.println(" Riktig");
		}
		else{
			// return String.format("FEIL, forventet %d, men fikk %d", forventet, returVerdi);
			System.out.println(String.format(" FEIL, forventet %d, men fikk %d", forventet, returVerdi));
		}
	}

	public static void testStringRetur(String testDesc, String returVerdi, String forventet){
		System.out.print(testDesc);
		if(returVerdi == null){
			if (forventet == null) {
				System.out.println(" Riktig");
			}
			else{
				System.out.println(String.format(" FEIL, forventet %s, men fikk NULL", forventet));
			}
		}
		else{
			if(returVerdi.equals(forventet)){
				System.out.println(" Riktig");
				// return "Riktig";
			}
			else{
				// return String.format("FEIL, forventet %d, men fikk %d", forventet, returVerdi);
				System.out.println(String.format(" FEIL, forventet %s, men fikk %s", forventet, returVerdi));
			}
		}
	}

}