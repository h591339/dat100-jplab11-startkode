package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;

import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	
	private int nesteledig;

	public Blogg() {
	
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		
		innleggtabell  = new Innlegg[lengde];
		
		nesteledig = 0;
	}

	public int getAntall() {
		
		return nesteledig;
		
	}
	
	public Innlegg[] getSamling() {
		
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

        for (int i = 0; i < nesteledig; i++) { 

            if (innleggtabell[i].erLik(innlegg)) {   
                return i;
            }
        } return -1;
       
	}

	public boolean finnes(Innlegg innlegg) {
		
		
			if (finnInnlegg(innlegg) >=  0) {
	            return true;
			}
			return false; 
	    }
	

	public boolean ledigPlass() {

		for(int i = 0; i < innleggtabell.length ; i++) {
		if (innleggtabell[i] == null) {
			return true;
		}
		}return false; 
    }

	
	public boolean leggTil(Innlegg innlegg) {
		
		if(ledigPlass() && !finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig ++;
			return true;
		} 
		else return false;
	}
	
	
	public String toString() {
		String x = getAntall() + "\n";  
		for(int i = 0; i < innleggtabell.length; i++) {
			x += innleggtabell[i]; //
		}
		return x;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}