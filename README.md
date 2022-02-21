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
<li>E' buona norma creare un package in cui andreamo a inserire tutti i test.</li>
<li>Creiamo una classe Test per ogni classe che vogliamo testare, è buona norma indicare nel nome la classe di riferimento. Es. class Animale --> Test_Animale</li>
<li>La classe Test deve avere lo stesso </li>
<li>La classe di Test deve contenert i Test Case per i metodi non correlati e un Test Suite per i metodi correlati.</li>
