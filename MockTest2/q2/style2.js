document.addEventListener('DOMContentLoaded', function() {
    var inputText = document.getElementById('inputText');
    var submitButton = document.getElementById('submitButton');
    var list = document.getElementById('list');
  
    submitButton.addEventListener('click', function() {
      var text = inputText.value;
      if (text !== '') {
        var listItem = document.createElement('li');
        listItem.textContent = text;
        list.appendChild(listItem);
        inputText.value = '';
      }
    });
  });
  