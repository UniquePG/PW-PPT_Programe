document.addEventListener('DOMContentLoaded', function() {
    var openModalButton = document.getElementById('openModalButton');
    var modalContainer = document.getElementById('modalContainer');
    var closeButton = document.querySelector('.close-button');
    var body = document.querySelector('body');
  
    openModalButton.addEventListener('click', function() {
      modalContainer.style.display = 'flex';
      body.classList.add('modal-open');
    });
  
    closeButton.addEventListener('click', function() {
      modalContainer.style.display = 'none';
      body.classList.remove('modal-open');
    });
  
    modalContainer.addEventListener('click', function(event) {
      if (event.target === modalContainer) {
        modalContainer.style.display = 'none';
        body.classList.remove('modal-open');
      }
    });
  });
  