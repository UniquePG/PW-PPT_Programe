document.addEventListener('DOMContentLoaded', function() {
    var dataContainer = document.getElementById('dataContainer');
  
    // Display skeleton loader
    for (var i = 0; i < 5; i++) {
      var skeletonLoader = document.createElement('div');
      skeletonLoader.classList.add('skeleton-loader');
      dataContainer.appendChild(skeletonLoader);
    }
  
    // Fetch data from JSONPlaceholder API
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(function(response) {
        return response.json();
      })
      .then(function(data) {
        // Remove skeleton loader
        dataContainer.innerHTML = '';
  
        // Display fetched data
        data.forEach(function(post) {
          var postElement = document.createElement('div');
          postElement.textContent = post.title;
          dataContainer.appendChild(postElement);
        });
      })
      .catch(function(error) {
        console.log('Error:', error);
      });
  });
  