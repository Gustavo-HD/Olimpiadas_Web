<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="olimpiadaController?command=Inicio">Olimp�adas USJT</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="${ menu eq 'inicio' ? 'active' : ''}"><a href="olimpiadaController?command=Inicio">In�cio</a></li>
      <li class="${ menu eq 'pais' ? 'active' : ''}"><a href="olimpiadaController?command=Pais">Pa�ses</a></li>
      <li class="${ menu eq 'modalidade' ? 'active' : ''}"><a href="olimpiadaController?command=Modalidade">Modalidades</a></li>
      <li class="${ menu eq 'medalha' ? 'active' : ''}"><a href="olimpiadaController?command=Medalha">Quadro de Medalhas</a></li>
    </ul>
  </div>
</nav>