# language: es
@Característica
Característica: Consumir un API dummy para el examen final
  Yo como evaluado
  Quiero enviar unos consumos hacia un API Rest
  Para obtener una respuesta del servicio de eliminar y actualizar

   @EscenarioPUT
  Escenario: Consumir una peticion tipo PUT al API Dummy Rest
    Dado el tester que hace hace el examen final
    Cuando consume una peticion tipo PUT al API Dummy Rest
    Entonces obtiene una respuesta exitosa del servicio actualizar API Dummy Rest
     Y el usuario fue actualizado correctamente

  @EscenarioDelete
  Escenario: Consumir una peticion tipo Delete al API Dummy Rest
    Dado el tester que hace hace el examen final
    Cuando consume una peticion tipo Delete al API Dummy Rest
    Entonces obtiene una respuesta exitosa del servicio Eliminar API Dummy Rest
    Y el mensaje de eliminación es correcto





