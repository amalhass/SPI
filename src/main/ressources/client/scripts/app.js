(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput']).config(
			[ '$routeProvider',function($routeProvider, $urlRouterProvider) {

				$routeProvider
					.when('/Clientformation', {
					templateUrl: 'views/Formation/formation.html',
					controller: 'FormationCtrl',
					controllerAs: 'formation'
				})
					.when('/Clientformation/:codeFormation', {
						templateUrl: 'views/Formation/infoFormation.html',
						controller: 'FormationInfoCtrl',
						controllerAs: 'formationInfo'
					})
					.when('/Ajouterformation', {
						templateUrl: 'views/Formation/ajouterFormation.html',
						controller: 'FormationAddCtrl',
						controllerAs: 'formationAdd'
					})
					.when('/Updateformation/:codeFormation', {
						templateUrl: 'views/Formation/updateFormation.html',
						controller: 'FormationUpdateCtrl',
						controllerAs: 'formationUpdate'
					})
					.when('/', {
						templateUrl: 'views/Acceuil.html'
					})
                    .when('/Clientenseignant',{
                        templateUrl: 'views/Enseignant/enseignant.html',
                        controller: 'EnseignantCtrl',
                    })
                    .when('/Clientenseignant/:noEnseignant', {
                        templateUrl: 'views/Enseignant/infoEnseignant.html',
                        controller: 'EnseignantInfoCtrl'

                    })
					.when('/AjouterEnseignant', {
						templateUrl: 'views/Enseignant/ajouterEnseignant.html',
						controller: 'EnseignantAddCtrl'

					})
					.when('/UpdateEnseignant/:noEnseignant', {
						templateUrl: 'views/Enseignant/updateEnseignant.html',
						controller: 'EnseignantUpdateCtrl'
					})


			} ]
    )

}).call(this);
