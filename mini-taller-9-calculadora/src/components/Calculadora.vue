<template>
  <div class="calculadora">

    <span>Nota 1: </span>
    <input v-model="nota1">
    <span>Nota 2: </span>
    <input v-model="nota2">
    <span>Nota 3: </span>
    <input v-model="nota3">
    <span>Nota 4: </span>
    <input v-model="nota4">
    <span>Nota 5: </span>
    <input v-model="nota5">
    <span>Nota 6: </span>
    <input v-model="nota6">
  
    <button @click="calcularPromedio">Calcular Promedio </button>

    <span>Promedio: {{ promedio }} </span>
  </div>
</template>

<script setup>
  import { ref } from "vue";
  
  
  const nota1 = ref(0);
  const nota2 = ref(0);
  const nota3 = ref(0);
  const nota4 = ref(0);
  const nota5 = ref(0);
  const nota6 = ref(0);

  const promedio = ref(0);
    
  const calcularPromedio = () =>  {
    promedio.value = (parseFloat(nota1.value*0.2) + parseFloat(nota2.value*0.2) + parseFloat(nota3.value*0.2) + parseFloat(nota4.value*0.2) + parseFloat(nota5.value*0.1) + parseFloat(nota6.value*0.1))
    promedio.value = promedio.value.toFixed(2)
  }
</script>

<style scoped>

.calculadora {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 1rem;
}

</style>
