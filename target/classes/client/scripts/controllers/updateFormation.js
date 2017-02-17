/**
 * Created by DOSI on 14/02/2017.
 */
angular.module('app').controller('FormationUpdateCtrl', ['$scope','$routeParams','ServiceFormation' ,function ($scope,$routeParams,ServiceFormation) {


        ServiceFormation.getOneFormation($routeParams.codeFormation,function (data) {
            $scope.formation = data;
            console.log($scope.formation);
        });
    $scope.updateFormation=function() {
        $scope.formation["Content-Type"] = "application/json";
        ServiceFormation.updateFormation($scope.formation);

    }





}]);