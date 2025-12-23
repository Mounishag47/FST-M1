import pytest

@pytest.fixture
def wallet():
    return {"amount": 0}

@pytest.mark.parametrize(
    "earned, spent, expected",
    [
        (100, 30, 70),
        (50, 20, 30),
        (200, 50, 150)
    ]
)
def test_wallet_transactions(wallet, earned, spent, expected):
    wallet["amount"] += earned
    wallet["amount"] -= spent
    assert wallet["amount"] == expected
