# JAVA_UNIT_TEST
Serve per verificare se il nostro programma funziona correttamente e non generi eccezioni non gestite.</br>
JUNIT è un framework per lo sviluppo di unit test in java.</br>
Unit test è una metodologia per verificare il corretto funzionamento di ogni metodo o gruppo di metodi che implementano una singola funzionalità - unit.</br>
Come possiamo organizzare i nostri unit test:
<li>Test Case: verifica una singola unità di codice.</li>
<li>Test Suite: è un gruppo di Test Case che consentono di verificare un gruppo di funzionalità correlate.</li>
<h3>L'insieme di tutti i test creati vanno a formare il test book da allegare alla documentazione del software.</h3>
<h3>Limiti dei Unit Test</h3>
<li>Non è possibile individuare tutti gli errori di integrazione tra componenti.</li>
<li>Non è possibile utilizzarlo per la valutazione delle prestazioni.</li>
<h1>JUNIT</h1>
E' un framework open-source che consente di creare unit test (Test Case o Test Suite) in java ed eseguirli automaticamente.</br>
Procedimento:
<li>Creiamo all'interno del nostro progetto un nuovo progetto test</li>
<li>Creiamo un package che lo stesso nome del package da testare, in cui andreamo a inserire tutti i test.</li>
<li>Creiamo una classe Test per ogni classe che vogliamo testare, è buona norma indicare nel nome la classe di riferimento. Es. class Animale --> Test_Animale</li>
<li>La classe di Test deve contenert i Test Case per i metodi non correlati i Test Suite per i metodi correlati.</li>
<li>Il nome di ogni test case deve essere composto da un prefisso che esprime cosa stiamo testando seguito dal suffisso test. Es: sommaTest()</li>
<li>Per ogni test case dobbiamo utilizzare l'annotation @Test</li>
<h2>ASSERT</h2>
Gli Assert servono per verificare se effettivamente il metodo testato restituisce il valore atteso. In pratica sono dei metodi statici messi a disposizione dell'api (junit.Assert). Metedoti principali:
  <li>assertNull(String sms, obj): verifica se l'oggetto è null</li>
  <li>assertNotNull(String sms, obj): verifica se l'oggetto non è null</li>
  <li>assertEquals(String sms, expected, actual): verifica se actual è uguale a expected</li>
  <li>assertNotEquals(String sms, expected, actual): verifica se actual non è uguale a expected</li>
  <li>assertArrayEquals(String sms, expected, actual): verifica se actual non è uguale a expected dove entrambi sono array</li>
<h3>E' possibile creare Assert per verificare le eccezioni inserite</h3>  
<h2>ASSERT PARAMETRIZZATE</h2>
Sono utilizzate per creare test con parametrizzati:
<li>Creaiamo la classe del test ma dobbiamo inserire l'annotation @RunWith(Parameterized.class)</li>
<li>Dobbiamo importare junit.runner.*</li>
<li>Creiamo un metodo statico che ritorni una collection, che conterrò tutti i valori da passare al test. La collection deve essere bidimensionale in cui il primo parametro e' il valore passato e il secondo l'esito.</li>
<li>Dobbiamo inserire l'annotation @Parameterized.Parameters.</li>
<li>Dobbiamo creare il costrutture della classe test case con due parametri in ingresso: il parametro passato e l'esito.</li>
<li>Creiamo i nostri test con gi asset opportuni</li>

