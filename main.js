const APIController = (function() {

    const clientId = '0f150e12d04844fa9f18734d5f942f2a';
    const clientSecret = '655fb58d79844ca6b737b96fccf52d05';

    const _getToken = async () => {
        const result = await fetch('https://accounts.spotify.com/api/token', {
            method: 'POST',
            headers: {
                'Content-Type' : 'application/x-www-form-urlencoded',
                'Authorization' : 'Basic ' + btoa(clientId + ':' + clientSecret)
            },
            body: 'grant_type=client_credentials'
        });
        
        const data = await result.json();
        return data.access_token;
    }

    const _getGenres  = async (token) => {
        
        const result = await fetch('https://api.spotify.com/v1/browse/categories?locale=sv_US', {
            method: 'GET',
            headers: {'Authorization' : 'Bearer ' + token}
        })

        const data = await result.json();
        return data.categories.items
    }

    return {
        _getToken() {
            return _getToken();
        },
        _getGenres(token) {
            return _getGenres(token);
        }
    }
})();

const AppController = (function(APIController) {

    function createGenre(name){
        var tag = document.createElement("p"); 
        var text = document.createTextNode(name);
        tag.appendChild(text);
        var element = document.getElementById("genres");
        element.appendChild(tag);
    }
    
    const loadGenres = async () => {
        const token = await APIController._getToken();
        const genres = await APIController._getGenres(token);
        genres.forEach(element => createGenre(element.name));
    }

    return {
        init() {
            loadGenres();
        }
    }
})(APIController);

AppController.init();
